package com.example.mockitojavatest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class RepositryTest {

    @Mock
    Repositry repositry;

    @Before
    public void setUp() throws Exception {
    }


    //mock use in detail
    @Test
    public void getData() {

          when(repositry.getData()).thenReturn("This is Mock data");
         System.out.println(repositry.getData());

        //Why giving error in both repositry.getData() in spy and mock
          when(repositry.getData()).thenReturn(repositry.getData());
         System.out.println(repositry.getData());

        //It return real value with spy and null with mock
        doReturn(repositry.getData()).when(repositry).getData();
        System.out.println(repositry.getData());

        //void
        //doNothing will do nothing but give test passed if it execute otherwise will give error
        //and since void so will not return anything
        doNothing().when(repositry).getvalue("a","b");



    }

}