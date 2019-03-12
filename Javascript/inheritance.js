function Parent() {
    this.name = 'beck';
}

Parent.prototype.sayName = function () {
    console.log(this.name);
    return this.name;
}

function Children() {
    
}

function inherit(C, P) {
    C.prototype = new P();
}

inherit(Children, Parent);

var child = new Children();



