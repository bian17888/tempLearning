var egg = (function () {
    var data = [1, 2, 3, 4, 5],
        index = 0;

    return {
        hasNext: function () {
            return index < data.length;
        },
        next: function () {
            if (this.hasNext()) {
                index = index + 1;
            } else {
                throw {
                    type: 'Error',
                    message: 'do not has next element'
                }
            }
            return data[index];
        },
        rewind: function () {
            index = 0;
        },
        current: function () {
            return data[index];
        }
    }
}());