package org.tensorflow.demo;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity {
    TextView t = findViewById(R.id.text);
    if (result == "motherboard")
    {
        t.setText("info for motherboard");
    }
    else if (result == "ram")
    {
        t.setText("info for motherboard");
    }
     else if (result == "ram")
    {
        t.setText("info for motherboard");
    }
    else
    {
        t.setText("object not available in memory");
    }
}
