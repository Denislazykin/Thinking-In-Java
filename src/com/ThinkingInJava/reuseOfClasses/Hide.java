package com.ThinkingInJava.reuseOfClasses;

/*
Перегрузка имени метода их базового класса
в производном классе, не скроет базовую версию метода
 */
class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 3.14f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    void doh(Milhouse milhouse) {
        System.out.println("doh(Milhouse)");
    }
}

class Lisa extends Homer {
    /*  @Override
      void doh(Milhouse milhouse) {
          System.out.println("doh(Milhouse)");
      }
  }
     */
    public class Hide {
        public static void main(String[] args) {
            Bart bart = new Bart();
            bart.doh(1);
            bart.doh('g');
            bart.doh(4.33f);
            bart.doh(new Milhouse());
        }
    }
}