package cn.com.hth.interface1.timers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/7 22:34
 */
public class TimerTest {

    public static void main(String[] args) {
//        ActionListener listener = new TimePrinter();
//        Timer t = new Timer(10000,listener);
//        t.start();

        TalkingClock talkingClock = new TalkingClock(1000,true);
        talkingClock.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(1);

    }

}


class TimePrinter implements ActionListener{


    @Override
    public void actionPerformed(ActionEvent e) {
//        Date now = new Date();
//        System.out.println("At the tone, the time is"+now);
//        Toolkit.getDefaultToolkit().beep();
        TalkingClock talkingClock = new TalkingClock(1000,true);



    }
}