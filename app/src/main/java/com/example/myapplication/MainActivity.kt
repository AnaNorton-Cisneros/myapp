package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

//components I want:
//buttons, card, text button


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
                Column {
                    Text(text = "Find out which foods are best to combat sickness!")

                    Text(
                        text = "Select your symptoms:",
                        color = Color.Red
                    )
                    val checkedState = remember { mutableStateOf(true) }
                    Row {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it }
                        )
                        Text("dizziness", modifier = Modifier.width(150.dp))
                    }
                    Row {

                        val checkedState2 = remember { mutableStateOf(true) }
                        Checkbox(
                            checked = checkedState2.value,
                            onCheckedChange = { checkedState2.value = it }
                        )
                        Text("heartburn")
                    }
                    Row {
                        val checkedState3 = remember { mutableStateOf(true) }
                        Checkbox(
                            checked = checkedState3.value,
                            onCheckedChange = { checkedState3.value = it }
                        )
                        Text("headache")
                    }
                    Row {

                        val checkedState4 = remember { mutableStateOf(true) }
                        Checkbox(
                            checked = checkedState4.value,
                            onCheckedChange = { checkedState4.value = it }
                        )
                        Text("nausea")
                    }

                    val checkedState5 = remember { mutableStateOf(true) }
                    Row {
                        Checkbox(
                            checked = checkedState5.value,
                            onCheckedChange = { checkedState5.value = it }
                        )
                        Text("cough/cold")
                    }
                    Row {

                        val checkedState6 = remember { mutableStateOf(true) }
                        Checkbox(
                            checked = checkedState6.value,
                            onCheckedChange = { checkedState6.value = it }
                        )
                        Text("indigestion")
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = {
                            //enter here ↓

                            //enter here ^^^
                        }) {
                            Text("GO")
                        }
//public class MyActivity extends Activity {
//      protected void onCreate(Bundle icicle) {
//          super.onCreate(icicle);
//
//          setContentView(R.layout.content_layout_id);
//
//          final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_id);
//          if (checkBox.isChecked()) {
//              checkBox.setChecked(false);
//          }
//      }
//  }
                    }

                }
            }

        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Text(text = "Hello")
    MyApplicationTheme {
        Greeting("Android")
    }
}