package edu.cnm.deepdive.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;


public class MainActivity extends AppCompatActivity {
  private EditText fahrenheit;
  private EditText celsius;
  private EditText kelvin;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.convert_fahrenheiot).setOnClickListener((v) -> {
      String fahrenheitText = fahrenheit.getText().toString().trim();
      double fTemp = fahrenheitText.isEmpty() ? 0 : double.paraseDouble(fahrenheitText);
      fahrenheit.setText(String.format("%.2f", fTemp));
      celsius.setText(String.format("%.2f", (fTemp - 32) * 5 / 9));
      kelvin.setText(String.format("%.2f", (fTemp - 32) * 5 / 9 + 273.15));
    });

    findViewById(R.id.convert_celsius).setOnClickListener((v) -> {
      String fahrenheitText = celsius.getText().toString().trim();
      double cTemp = fahrenheitText.isEmpty() ? 0 : double.paraseDouble(celsiusText);
      celsius.setText(String.format("%.2f", cTemp));
      celsius.setText(String.format("%.2f", (cTemp - 32) * 5 / 9));
      kelvin.setText(String.format("%.2f", (cTemp - 32) * 5 / 9 + 273.15));
    });
  }
}
