
package com.sig.controller.menubar_action_listner;

import com.sig.view.MyFrame;


public class CloseFileMenuBarActionListner {

    private MyFrame frame;

    public CloseFileMenuBarActionListner(MyFrame frame) {this.frame = frame;}

    public void closeFileMenuBar() {System.exit(0);}

}
