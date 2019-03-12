/**
 * 文件说明
 * @desc 装饰者模式 - 通过集成实现 (较繁琐, 不推荐, 用于学习了解 原型链 + 继承)
 */
function Sale(price) {
    this.price = price || 10;
}

Sale.prototype.getPrice = function () {
    return this.price;
}

// 关键方法, 通过 class 继承实现
// 这里面的 this 指针是重点
Sale.prototype.decorate = function (decorator) {
    var F = function () { },
        overrides = this.constructor.decorators[decorator],
        i, newObj;

    F.prototype = this;
    newObj = new F();
    newObj.uber = F.prototype;
    for (i in overrides) {
        if (overrides.hasOwnProperty(i)) {
            newObj[i] = overrides[i];
        }
    }

    return newObj;
}

Sale.decorators = {}
// 这里面的 this 指针是重点
Sale.decorators.fedtax = {
    getPrice: function () {
        var price = this.uber.getPrice();
        price += price * 5 / 100;
        return price;
    }
}
Sale.decorators.money = {
    getPrice: function () {
        var price = this.uber.getPrice();
        price = '$' + price.toFixed(2);
        return price;
    }
}