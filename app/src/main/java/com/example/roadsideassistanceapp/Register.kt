package com.example.roadsideassistanceapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.roadsideassistanceapp.ui.theme.RoadsideAssistanceAppTheme

@Composable
fun RegisterPage(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("Hello") }
    var email by remember { mutableStateOf("Hello") }
    var phoneNumber by remember { mutableStateOf("Hello") }
    Column() {
        Text(
            text = stringResource(R.string.register),
            style = MaterialTheme.typography.displayLarge,
            //color = Color(R.color.main_red),
            modifier = modifier
        )
        Text(
            text = stringResource(R.string.lets_get_started),
            style = MaterialTheme.typography.displaySmall,
            modifier = modifier
        )
        Text(
            text = stringResource(R.string.create_an_account),
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier
        )
        Text(
            text = stringResource(R.string.full_name),
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier
        )
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ex. Earl J. Smiley") }
        )
        Text(
            text = stringResource(R.string.email),
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("example@gmail.com") }
        )
        Text(
            text = stringResource(R.string.or),
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier
        )
        Text(
            text = stringResource(R.string.phone_number),
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier
        )
        TextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            label = { Text("+447770 xxxxxx") }
        )
        Row() {
            Text(
                text = stringResource(R.string.already_have_account),
                style = MaterialTheme.typography.headlineSmall,
                modifier = modifier
            )
            Text(
                text = stringResource(R.string.login),
                style = MaterialTheme.typography.headlineSmall,
                //color = getResource().getColor(R.color.main_red),
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    RoadsideAssistanceAppTheme {
        RegisterPage()
    }
}