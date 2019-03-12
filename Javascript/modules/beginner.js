// 参考 : http://www.ruanyifeng.com/blog/2012/10/javascript_module.html

// QuickStart
var module = (function($, YAHOO) {
  //...
})(jQuery, YAHOO);

// 1 原始版 - index.js 中的2个方法
function a() {}
function b() {}

/**
 * 2 原始升级版
 *  缺点 : 外部可以改动_count变量
 *  */

var module1 = {
  _count: 0,
  m1: function() {},
  m2: function() {}
};
module1.m1();

/**
 * 3 基础班
 *  */

var module2 = (function() {
  var _count = 0;
  var m1 = function() {};
  var m2 = function() {};
  return {
    m1: m1,
    m2: m2
  };
})();
