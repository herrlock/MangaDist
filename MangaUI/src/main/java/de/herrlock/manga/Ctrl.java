package de.herrlock.manga;

import javax.swing.JOptionPane;

import de.herrlock.manga.downloader.DialogDownloader;
import de.herrlock.manga.host.PrintAllHoster;

public final class Ctrl {

    public static void main( String[] args ) {
        String message = "Select variant to execute.";
        String title = "Please select";
        int optionType = JOptionPane.DEFAULT_OPTION;
        int messageType = JOptionPane.QUESTION_MESSAGE;
        Object[] options = {
            "Download", "Show Hoster"
        };
        int selection = JOptionPane.showOptionDialog( null, message, title, optionType, messageType, null, options, options[0] );
        switch ( selection ) {
            case 0:
                DialogDownloader.execute();
                break;
            case 1:
                PrintAllHoster.execute();
                break;
            case -1:
                // X is pressed
                break;
            default:
                System.out.println( "invalid option chosen" );
                break;
        }

        System.out.println( "finished" );
    }

    private Ctrl() {
        // nothing to do
    }
}
