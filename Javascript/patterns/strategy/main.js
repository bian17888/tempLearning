var data = {
    first_name: 'X',
    last_name: 'Man',
    age: 'unknown',
    username: ' 0_0'
}


var validator = {
    // 所有可用的检查
    types: {},

    // 当前验证配置
    // 名称 : 验证类型
    config: {
        first_name: 'isNonEmpty',
        age: 'isNumber'
    },

    // 当前验证会话中的错误信息
    message: [],

    // 接口方法
    // `data` 为键-值对
    validate: function (data) {
        var i, checker, result_ok,
            _types = this.types,
            _config = this.config,
            _message = this.message;

        for (i in data) {
            if (data.hasOwnProperty(i)) {
                checker = _types[_config[i]];

                if (!checker) {
                    // validator.xx 不存在
                }

                result_ok = checker.validate(data[i]);

                if (!result_ok) {
                    _message.push(checker.instructions);
                }
            }
        }
        return this.hasErrors();
    },
    hasErrors: function () {
        return this.message.length !== 0;
    }
}

validator.types.isNonEmpty = {
    validate: function (value) {
        return value !== '';
    },
    instructions: 'the value cannot be empty'
}
validator.types.isNumber = {
    validate: function (value) {
        return !isNaN(value);
    },
    instructions: 'the value can only be a valid number, e.g. 1, 3.14 or 2000'
}


// 调用
// validator.validate(data);
// if (validator.hasErrors()) {
//     console.log(validator.message.join('\n'));
// }
