package com.company.mediator;

class JobWorker{

    private String name;
    private Mediator mediator;

    public JobWorker(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * Wysłanie komunikatu
     */
    public void sendMessage(){
        this.mediator.sendMessage(name + " send msg");
    }

    /**
     * Odebranie komunikatu
     * @param message
     */
    public void receiveMessage(String message){
        System.out.println("Message -> msg: '" + message + "' to: " + name);
    }
}
