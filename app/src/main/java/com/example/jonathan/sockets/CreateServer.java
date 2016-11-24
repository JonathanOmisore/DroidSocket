package com.example.jonathan.sockets;
import java.net.*;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class CreateServer extends Thread {
    ServerSocket serverSocket;
    Socket clientSocket;
    TextView mText;
    Button mbutton;

    public void run(){
        try{

    }
        catch(Exception e){
        }
    }

    CreateServer(int port, String internalip, TextView view, Button button){
        mbutton = button;
        mText = view;
        try{
            mbutton.setVisibility(View.INVISIBLE);
            serverSocket = new ServerSocket(port);
            serverSocket.bind(new InetSocketAddress(internalip,port));

            clientSocket = serverSocket.accept();
            mText.setText("Received connection from " + clientSocket.getRemoteSocketAddress());
        }
        catch(Exception e){
            Log.e("main_activity",e.toString());


        }


    }
}
