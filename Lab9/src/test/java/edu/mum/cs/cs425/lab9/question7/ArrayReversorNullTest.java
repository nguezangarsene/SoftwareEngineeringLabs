package edu.mum.cs.cs425.lab9.question7;

import edu.mum.cs.cs425.lab9.question7.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorNullTest {
    private ArrayReversor arrayReversor;
    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;
    }

    @Test
    public void reversedArray() {
        int[][] a_in = null;
        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(null);
        int[] output = arrayReversor.reversedArray(a_in);
        int [] expected = null;
        assertArrayEquals(expected,output);
        verify(arrayFlattenerService).flattenArray(a_in);

    }
}