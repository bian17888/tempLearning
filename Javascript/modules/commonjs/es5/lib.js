// 定义变量
var str = "beck";

// 定义对象
var config = {
  name: "lib.js",
  size: "10kb"
};

// 定义函数
var initNum = 0;
var addX = function(value) {
  return initNum + value;
};

module.exports.str = str;
module.exports.config = str;
module.exports.addX = addX;
