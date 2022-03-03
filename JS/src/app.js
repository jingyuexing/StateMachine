/*
* @Author: Jingyuexing
* @Date:   2022-02-03 22:00:47
* @Last Modified by:   Jingyuexing
* @Last Modified time: 2022-02-03 22:22:20
*/
class Person{
    state = ""
    constructor(){
        this.changeState("born");
    }
    /**
     * @type {Function}
     */
    onBorn(){
        console.log("一张白纸");
    };
    /**
     * @type {Function}
     */
    onDead(){
        console.log("唯有税收和死亡不可避免");
    };

    onYoung(){
        console.log("**************");
    }
    young(hook){
        this.changeState("young");
    }
    dead(){
        this.changeState("dead");
    }
    
    /**
     * [changeState description]
     * @param  {string} state 状态
     * @return {[type]}       [description]
     */
    changeState(state){
        this.state = state;
        switch(state){
            case "born": this.onBorn();
                break;
            case "dead": this.onDead();
                break;
            case "young": this.onYoung();
                break;
        }
    }

}