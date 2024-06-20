package com.example.mopro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mopro.ui.theme.moproTheme
import uniffi.mopro.GenerateProofResult

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            moproTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                ) { ProofComponent() }
            }
        }
    }
}

@Composable
fun ProofComponent() {
    var initTime by remember { mutableStateOf("init time:") }
    var provingTime by remember { mutableStateOf("proving time:") }
    var verifyingTime by remember { mutableStateOf("verifying time: ") }
    var valid by remember { mutableStateOf("valid:") }
    var res by remember {
        mutableStateOf<GenerateProofResult>(
                GenerateProofResult(proof = ByteArray(size = 0), inputs = ByteArray(size = 0))
        )
    }

    val inputs = mutableMapOf<String, List<String>>()
    inputs["in"] =
            listOf(
                    "0",
                    "0",
                    "1",
                    "0",
                    "1",
                    "1",
                    "1",
                    "0",
                    "1",
                    "0",
                    "1",
                    "0",
                    "0",
                    "1",
                    "1",
                    "0",
                    "1",
                    "1",
                    "0",
                    "0",
                    "1",
                    "1",
                    "1",
                    "0",
                    "0",
                    "0",
                    "1",
                    "0",
                    "1",
                    "1",
                    "1",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0"
            )

    Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
        Button(
                onClick = {
                    Thread(
                                    Runnable {
                                        val startTime = System.currentTimeMillis()
                                        uniffi.mopro.initializeMopro()
                                        val endTime = System.currentTimeMillis()
                                        initTime =
                                                "init time: " +
                                                        (endTime - startTime).toString() +
                                                        " ms"
                                    }
                            )
                            .start()
                },
                modifier = Modifier.padding(bottom = 80.dp)
        ) { Text(text = "init") }
        Button(
                onClick = {
                    Thread(
                                    Runnable {
                                        val startTime = System.currentTimeMillis()
                                        res = uniffi.mopro.generateProof2(inputs)
                                        val endTime = System.currentTimeMillis()
                                        provingTime =
                                                "proving time: " +
                                                        (endTime - startTime).toString() +
                                                        " ms"
                                    }
                            )
                            .start()
                },
                modifier = Modifier.padding(top = 20.dp)
        ) { Text(text = "generate proof") }
        Button(
                onClick = {
                    val startTime = System.currentTimeMillis()
                    valid = "valid: " + uniffi.mopro.verifyProof2(res.proof, res.inputs).toString()
                    val endTime = System.currentTimeMillis()
                    verifyingTime = "verifying time: " + (endTime - startTime).toString() + " ms"
                },
                modifier = Modifier.padding(top = 120.dp)
        ) { Text(text = "verify proof") }
        Text(
                text = "Keccak256 proof",
                modifier = Modifier.padding(bottom = 180.dp),
                fontWeight = FontWeight.Bold
        )

        Text(text = initTime, modifier = Modifier.padding(top = 200.dp).width(200.dp))
        Text(text = provingTime, modifier = Modifier.padding(top = 250.dp).width(200.dp))
        Text(text = valid, modifier = Modifier.padding(top = 300.dp).width(200.dp))
        Text(text = verifyingTime, modifier = Modifier.padding(top = 350.dp).width(200.dp))
    }
}
