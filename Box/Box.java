import javax.swing.JFrame;
import javax.swing.JPanel;

class Box{
      public static void main(String[] args) {
          double[] boxArr = new double [6];
          for (int i =0; i<args.length; i++) {
            boxArr[i]=Double.parseDouble(args[i]);
          }
            WireframeJApplet applet = new WireframeJApplet();
            applet.init(boxArr);
            final JFrame frame = new JFrame("Box");
            frame.setContentPane(applet.getContentPane());
            frame.setJMenuBar(applet.getJMenuBar());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1200, 700);
            frame.setLocation(100, 100);
            frame.setVisible(true);
            applet.start();
      }
}
