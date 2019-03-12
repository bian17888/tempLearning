// 父类构造函数
function CarMaker() { }

// a method of the parent
CarMaker.prototype.drive = function () {
    var str = 'Vroom, I have ' + this.doors + ' doors';
    console.log(str);
    return str;
}

// 静态工厂方法
CarMaker.factory = function (type) {
    var constr = type,
        newcar = {};

    // 如果构造函数不存在, 则发生错误
    if (typeof CarMaker[constr] !== 'function') {
        throw {
            name: 'Error',
            message: constr + " doesn't exist !"
        }
    }

    // 原型继承父类, 但只继承一次
    if (CarMaker[constr].prototype.drive !== 'function') {
        CarMaker[constr].prototype = new CarMaker();
    }

    // 创建实例
    newcar = new CarMaker[constr]();

    // *** 可选择性的调用一些方法, 然后返回 ...

    return newcar;
}

// 定义特定的汽车制造商
CarMaker.Compact = function () {
    this.doors = 4;
}

CarMaker.Convertible = function () {
    this.doors = 2;
}

CarMaker.SUV = function () {
    this.doors = 24;
}

