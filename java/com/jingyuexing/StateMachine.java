/*
* @Author: admin
* @Date:   2022-02-28 13:43:13
* @Last Modified by:   admin
* @Last Modified time: 2022-02-28 14:15:17
*/
package com.jingyuexing;

enum State{
    BORN,
    BABY,
    YOUNG,
    OLD,
    DEAD
}

/**
 * State Machine
 * this example is human
 */
class StateMachine{
    private State state;
    StateMachine(){
        this.changeState(State.BORN);
        System.out.printf("A human born");
    }
    public void baby(){
        if(this.state == State.BORN){
            changeState(State.BABY);
            System.out.println("A baby");
        }
    }
    public void young(){
        if(this.state == State.BABY){
            changeState(State.YOUNG);
            System.out.println("now, this human is a teenager");
        }
    }
    public void old(){
        if(this.state == State.YOUNG){
            changeState(State.OLD);
            System.out.println("this is aged");
        }
    }
    public void dead(){
        changeState(State.DEAD);
        System.out.println("life is full of accident");
    }
    /**
     * your can Override this method
     */
    public void onOld(){

    }
    /**
     * your can Override this method
     */
    public void onBaby(){
    }
    /**
     * your can Override this method
     */
    public void onYoung(){
    }
    /**
     * your can Override this method
     */
    public void onBorn(){
    }
    /**
     * your can Override this method
     */
    public void onDead(){
    }
    /**
     * change state
     * @param state the state
     */
    private void changeState(State state){
        this.state = state;
        switch(this.state){
            case BORN: this.onBorn();
                break;
            case BABY: this.onBaby();
                break;
            case YOUNG: this.onYoung();
                break;
            case OLD: this.onOld();
                break;
            case DEAD: this.onDead();
        }
    }
}

class Main{
    public static void main(String[] args) {
        StateMachine human = new StateMachine();
        human.baby();
        human.young();
        human.old();
        human.dead();
    }
}