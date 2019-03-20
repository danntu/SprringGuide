package com.example.brovko.lesson5;

import com.example.brovko.lesson5.impls.robot.ModelT1000;
import com.example.brovko.lesson5.impls.sony.SonyHand;
import com.example.brovko.lesson5.impls.sony.SonyHead;
import com.example.brovko.lesson5.impls.sony.SonyLeg;
import com.example.brovko.lesson5.impls.toshiba.ToshibaHand;
import com.example.brovko.lesson5.impls.toshiba.ToshibaHead;
import com.example.brovko.lesson5.impls.toshiba.ToshibaLeg;
import com.example.brovko.lesson5.interfaces.Hand;
import com.example.brovko.lesson5.interfaces.Head;
import com.example.brovko.lesson5.interfaces.Leg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelT100Config {

    Hand hand;
    Head head;
    Leg leg;

    @Bean(name = "t1000")
    public ModelT1000 getModelT1000(){
        return new ModelT1000();
    }

    @Bean(name = "t1000sony")
    public ModelT1000 getModelT1000Sony(){
        hand = sonyHand();
        head = sonyHead();
        leg = sonyLeg();
        return new ModelT1000(hand,head,leg);
    }

    @Bean(name = "t1000toshiba")
    public ModelT1000 getModelT1000Toshiba(){
        hand = toshibaHand();
        head = toshibaHead();
        leg = toshibaLeg();
        return new ModelT1000(hand,head,leg);
    }

    @Bean(name = "sonyHand")
    public SonyHand sonyHand(){
        return new SonyHand();
    }

    @Bean(name = "sonyHead")
    public SonyHead sonyHead(){
        return new SonyHead();
    }

    @Bean(name = "sonyLeg")
    public SonyLeg sonyLeg(){
        return new SonyLeg();
    }

    @Bean(name = "toshibaHand")
    public ToshibaHand toshibaHand(){
        return new ToshibaHand();
    }

    @Bean(name = "toshibaHead")
    public ToshibaHead  toshibaHead(){
        return new ToshibaHead();
    }

    @Bean(name = "toshibaLeg")
    public ToshibaLeg toshibaLeg(){
        return new ToshibaLeg();
    }
}
