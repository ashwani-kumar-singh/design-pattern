package behavioral.command;

import behavioral.command.invoker.RemoteControl;
import behavioral.command.reciever.Stereo;
import behavioral.command.reciever.TV;

/**
 * The Command Design Pattern is a behavioral design pattern that turns a request into a
 * stand-alone object, allowing parameterization of clients with different requests, queuing of requests,
 * and support for undoable operations(action or a series of actions that can be
 * reversed or undone in a system).
 * <p>
 * It decouples the sender (client or invoker) from the receiver (object performing the operation),
 * providing flexibility and extensibility.
 *
 * @link: <a href="https://www.geeksforgeeks.org/command-pattern/">...</a>
 */
public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        RemoteControl rm = new RemoteControl();
        rm.setCommand(new TurnOnCommand(tv));
        System.out.println("***************************** Press TV On *************************");
        rm.pressButton();

        System.out.println("***************************** Press TV Off *************************");
        rm.setCommand(new TurnOffCommand(tv));
        rm.pressButton();

        System.out.println("***************************** Press Channel Change *************************");
        rm.setCommand(new ChannelChangeCommand(tv));
        rm.pressButton();


        System.out.println("***************************** Press Stereo On *************************");
        rm.setCommand(new TurnOnCommand(stereo));
        rm.pressButton();

        System.out.println("***************************** Press Stereo Off *************************");
        rm.setCommand(new TurnOffCommand(stereo));
        rm.pressButton();

        System.out.println("***************************** Press Adjust Frequency *************************");
        rm.setCommand(new AdjustFrequencyCommand(stereo));
        rm.pressButton();
    }
}
