package br.senai.sp.jandira.mytrips.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun HomeScreen(modifier: Modifier =Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Card(
            modifier = modifier
                .width(150.dp)
                .height(50.dp)
                .align(alignment = Alignment.BottomStart),
                    shape = RoundedCornerShape(
                        topEnd = 32.dp
                    )
        ) {
            Card(
                modifier = modifier
                    .width(150.dp)
                    .height(50.dp)
                    .align(alignment = Alignment.BottomStart),
                shape = RoundedCornerShape(
                    topEnd = 32.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 32.dp, end = 32.dp)
                ) {
                    Text(
                    text = stringResource(R.string.Login),
                        color = Color.Blue,
                        fontSize = 32.sp,
                        modifier = Modifier
                            .padding(bottom = 68.dp)




                    )
                Text(
                    text = stringResource(R.string.Please_sign_in_to_continue),
                    fontSize = 32.sp,
                    modifier = Modifier
                        .padding(bottom = 68.dp)



                )
                } }
            }
        }
    }







class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTripsTheme {
                HomeScreen()
            }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview () {
    HomeScreen()
}