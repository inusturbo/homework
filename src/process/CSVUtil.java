package process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVUtil {
/*    public static void main(String[] args) {
        ArrayList<String[]> Valueslist=new ArrayList<String[]>();
        readValues("E:\\test.csv",Valueslist);
        for (int i=0;i<Valueslist.size();i++) {
            for (int j=0;j<Valueslist.get(i).length;j++){
                System.out.print(Valueslist.get(i)[j]+";");
            }
            System.out.println();
        }
    }*/
    public static void readValues(String readpath, ArrayList<String[]> Valueslist) {
        //想要读取的数据是一个[N,Dim]的二维矩阵
        System.out.println("CSVUtil:readValues()  >>>正在读取文件");
        File inFile = new File(readpath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFile));

            while (reader.ready()) {
                //这里没有办法使用矩阵进行操作，因为我们一行一行的读没有办法知道csv中保存数据的长度和宽度
                //但是返回的是一个String，我们可以对这个String进行操作，按照分隔符将其分割，最好能是能够保存到一个完整的结构中
                String line = reader.readLine();
                String[] splitline = line.split(",");
                //这里每一列的元素都是一个double数值，例如
                //因此接下来我能够直接的转换成Double类型的变量
                int Dim = splitline.length;
                //将splitline中的每个元素保存到double类型的数组中
                String[] temp = new String[Dim];
                for (int i = 0; i < Dim; i++) {
                    temp[i] = splitline[i];
                }
                Valueslist.add(temp);
            }
            System.out.println("CSVUtil:readValues()  >>>读取成功！");
            System.out.println("CSVUtil:readValues()  >>>正在关闭文件");
            reader.close();
            System.out.println("CSVUtil:readValues()  ###执行成功！");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("CSVUtil:readValues()  ###执行出错");
        }
    }
}
