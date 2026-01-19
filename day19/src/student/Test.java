package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int b = 0;
        Map<String, Grade> map = new HashMap<>();
        map.put("李白", new Grade(95, 70, 60, 98));
        map.put("杜甫", new Grade(90, 80, 85, 98));
        map.put("白居易", new Grade(80, 85, 55, 95));
        map.put("李商隐", new Grade(70, 50, 58, 90));
        String[] str = {"李白", "杜甫", "白居易","李商隐"};
        for (int i = 0; i < 4; i++) {
            double[] a = studenGrade(map.get(str[i]));
            System.out.println("学生的总成绩为" + (int) a[0] + "平均成绩为" + a[1]);
        }
        double[] a = (double[])ave(map).get(0);
        double[] d=(double[])ave(map).get(1);
        System.out.println("语文学科总分为"+a[3]+"平均分"+(int)d[3]);
        System.out.println("数学学科总分为"+a[1]+"平均分"+(int)d[1]);
        System.out.println("英语学科总分为"+a[2]+"平均分"+(int)d[2]);
        System.out.println("地理学科总分为"+a[0]+"平均分"+(int)d[0]);
        for (int i = 0; i < 4; i++) {
            int c = fail(map.get(str[i]));
            if (c == 1)
                b++;
        }
        System.out.println("挂科人数为" + b + "人");
        b=0;
        for (int i = 0; i < 4; i++) {
            int c = fail1(map.get(str[i]));
            if (c == 1)
                b++;
        }
        System.out.println("新标准下挂科人数为"+b+"人");
        for (int  i = 0;  i < 4;  i++) {
            System.out.println(str[i]+'\t'+map.get(str[i]).toString());
        }
    }

    public static double[] studenGrade(Grade g) {
        int a = g.getDili();
        int b = g.getShuxue();
        int c = g.getYingyu();
        int d = g.getYuwen();
        double sum = (double) (a + b + c + d);
        double avg = (double) (a + b + c + d) / 4;
        double[] arr = new double[2];
        arr[0] = sum;
        arr[1] = avg;
        return arr;
    }

  public static List ave(Map<String, Grade> map) {
        double[] arr = new double[4];
        double[] sum = new double[4];
      List<double[]> data = new ArrayList<>();
      String[] str = {"李白", "杜甫", "白居易","李商隐"};
      for (int i = 0; i < 4; i++) {
          sum[0]+=map.get(str[i]).getDili();
      }
      for (int i = 0; i < 4; i++) {
          sum[1]+=map.get(str[i]).getShuxue();
      }
      for (int i = 0; i < 4; i++) {
          sum[2]+=map.get(str[i]).getYingyu();
      }
      for (int i = 0; i < 4; i++) {
          sum[3]+=map.get(str[i]).getYuwen();
      }
      for (int i = 0; i < 4; i++) {
          arr[i]=sum[i]/4;
      }
      data.add(arr);
      data.add(sum);
      return data;
  }
    public static int fail(Grade g) {
        int a = g.getDili();
        int b = g.getShuxue();
        int c = g.getYingyu();
        int d = g.getYuwen();
        if (a < 60 || b < 60 || c < 60 || d < 60) {
            return 1;
        }
        return 0;
    }

    public static int fail1(Grade g) {
        int a = g.getDili();
        int b = g.getShuxue();
        int c = g.getYingyu();
        int d = g.getYuwen();
        if (a < 70 || b < 70 || c < 70 || d < 70) {
            return 1;
        }
        return 0;
    }
}