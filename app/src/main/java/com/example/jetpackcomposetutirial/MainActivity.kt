package com.example.jetpackcomposetutirial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion.FillWidth
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutirial.R.drawable
import com.example.jetpackcomposetutirial.ui.theme.JetpackComposeTutirialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutirialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayText(
                        textTitle = stringResource(R.string.title),
                        firstParagraph = stringResource(R.string.first_paragraph),
                        secondParagraph = stringResource(R.string.second_paragraph)
                    )
                }
            }
        }
    }
}

@Composable
fun DisplayText(textTitle: String, firstParagraph: String, secondParagraph: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = Modifier) {
        Image(
            painter =image,
            contentDescription = null,
            contentScale = FillWidth
        )
        Text(
            text = textTitle,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = firstParagraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp),


        )
        Text(
            text = secondParagraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutirialTheme {
        DisplayText(
            textTitle = stringResource(R.string.title),
            firstParagraph = stringResource(R.string.first_paragraph),
            secondParagraph = stringResource(R.string.second_paragraph)
            )
    }
}