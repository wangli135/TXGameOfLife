package tx.gameOfLife.model;

import org.junit.Test;

/**
 * Created by mjh on 2017/6/3.
 */
public class UtilsTest {
    @Test
    public void build() throws Exception {
        String path ="D:\\学习\\wx_devlop\\TXGameOfLife\\initMatrix.txt";
        System.out.println(Utils.initMatrixFromFile(path));

    }




}