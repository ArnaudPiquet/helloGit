module.exports = class Person {
    /*constructor() {
        this.id = 'id_1';
    }
    */
    constructor(id, name){
        this.id = `id_${id}`;
        this._name = name.charAt(0).toUpperCase() + name.slice(1);
    }
    set name(name) {
         this._name = name.charAt(0).toUpperCase() + name.slice(1);
    }
    get name() {
        return this._name;
    }
    toString() {
        return this;
    }
    whoIs(){
        return this.id+' '+this._name;
    }
}