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


}
