package tx.gameOfLife.model;

import org.junit.Assert;
import org.junit.Test;
import tx.gameOfLife.util.Utils;

/**
 * Created by mjh on 2017/6/3.
 */
public class UtilsTest {

    @Test
    public void initMatrixFromFile() throws Exception {
        String path = "D:\\学习\\wx_devlop\\TXGameOfLife\\test.case";
        CellMatrix cellMatrix = Utils.initMatrixFromFile(path);
        Assert.assertEquals(3, cellMatrix.getHeight());
        Assert.assertEquals(3, cellMatrix.getWidth());
        Assert.assertEquals(60, cellMatrix.getTransfromNum());
        Assert.assertEquals(200, cellMatrix.getDuration());
        int[][] expected = new int[][]{
                {1, 0, 1}, {0, 1, 0}, {1, 1, 1}
        };
        Assert.assertArrayEquals(expected, cellMatrix.getMatrix());

        Assert.assertEquals(null,Utils.initMatrixFromFile(""));
    }


}