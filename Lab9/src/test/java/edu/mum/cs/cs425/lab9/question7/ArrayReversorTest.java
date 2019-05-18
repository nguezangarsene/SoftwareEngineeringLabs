package edu.mum.cs.cs425.lab9.question7;

import edu.mum.cs.cs425.lab9.question7.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
    private ArrayReversor arrayReversor;

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
        int[][] a_in = new int[][]{{1,3}, {0}, {4,5,9}};
        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(new int[]{1,3,0,4,5,9});
        int [] output = arrayReversor.reversedArray(a_in);
        int [] expected = {9,5,4,0,3,1};
        assertArrayEquals(expected,output);
        verify(arrayFlattenerService).flattenArray(a_in);
    }
}