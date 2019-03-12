/**
 * 文件说明
 * @desc 装饰者模式 - 通过js动态性实现
 */
function Sale(price) {
    this.price = price || 10;
    this.decorators_list = [];
}

Sale.prototype.decorate = function (decorator) {
    this.decorators_list.push(decorator);
}

Sale.prototype.getPrice = function () {

    var decorators_list = this.decorators_list,
        price = this.price;

    decorators_list.forEach(function (element) {
        price = Sale.decorators[element].getPrice(price);
    });

    return price;
}



Sale.decorators = {}

Sale.decorators.fedtax = {
    getPrice: function (price) {
        return price + price * 5 / 100;
    }
}
Sale.decorators.money = {
    getPrice: function (price) {
        return '$' + price.toFixed(2);
    }
}