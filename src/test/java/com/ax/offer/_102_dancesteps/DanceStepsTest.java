package com.ax.offer._102_dancesteps;


import org.junit.Assert;
import org.junit.Test;

public class DanceStepsTest {

    @Test
    public void danceStepsTest() {

        DanceSteps danceSteps = new DanceSteps();
        int dances = danceSteps.dances(3);

        Assert.assertEquals(3,dances);

        dances = danceSteps.dances(10);



        System.out.println(dances);

    }

    @Test
    public void  dancesDTTest() {

        DanceSteps danceSteps = new DanceSteps();
        int i = danceSteps.dancesDT(2);
        int i1 = danceSteps.dancesDT(4);
        Assert.assertEquals(2,i);
        Assert.assertEquals(5,i1);
    }

}
