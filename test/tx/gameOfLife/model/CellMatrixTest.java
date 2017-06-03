package tx.gameOfLife.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mjh on 2017/6/3.
 */
public class CellMatrixTest {

    CellMatrix cellMatrix = null;
    String path = "D:\\学习\\wx_devlop\\TXGameOfLife\\initMatrix.txt";

    @Before
    public void init() {
        cellMatrix = Utils.initMatrixFromFile(path);
    }

    @Test
    public void transform() throws Exception {

        System.out.println(cellMatrix);
        cellMatrix.transform();
        System.out.println(cellMatrix);
        cellMatrix.transform();
        System.out.println(cellMatrix);
    }


    @Test
    public void findNearCell() throws Exception {
        Assert.assertEquals(1, cellMatrix.findLifedNum(0, 0));
        Assert.assertEquals(3, cellMatrix.findLifedNum(0, 1));
        Assert.assertEquals(2, cellMatrix.findLifedNum(0, 2));
        Assert.assertEquals(1, cellMatrix.findLifedNum(0, 3));
        Assert.assertEquals(2, cellMatrix.findLifedNum(1, 1));
        Assert.assertEquals(4, cellMatrix.findLifedNum(1, 2));
        Assert.assertEquals(3, cellMatrix.findLifedNum(1, 3));
        Assert.assertEquals(1, cellMatrix.findLifedNum(2, 0));
        Assert.assertEquals(0, cellMatrix.findLifedNum(2, 3));
    }

}