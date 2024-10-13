package com.mfo.teambalancerapp.ui.team

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mfo.teambalancerapp.R
import com.mfo.teambalancerapp.domain.model.Player

@Composable
fun TeamScreen() {
    val playersList = mutableListOf(
        Player("1", "Alex", 7.5F, false),
        Player("2", "Ben", 3.2F, false),
        Player("3", "Charlie", 9.1F, false),
        Player("4", "David", 2.8F, false),
        Player("5", "Ethan", 4.6F, false),
        Player("6", "Frank", 8.3F, false),
        Player("7", "George", 5.9F, false),
        Player("8", "Harry", 1.4F, false),
        Player("9", "Issac", 6.7F, false),
        Player("10", "Jack", 2.1F, false),
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(
            text = stringResource(id = R.string.tv_create_teams),
            fontSize = 24.sp
        )
        Text(text = stringResource(id = R.string.tv_players))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        ) {
            playersList.forEach { player ->
                PlayerItem(player = player)
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Players: ${playersList.size}")
            IconButton(onClick = { println("add player") }) {
                Icon(imageVector = Icons.Outlined.Add, contentDescription = stringResource(id = R.string.btn_add_player))
            }
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { println("generate") },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
            shape = RoundedCornerShape(25.dp),
        ) {
            Text(
                text = stringResource(id = R.string.btn_generate_teams),
                fontWeight = FontWeight.Bold
            )
        }
        /*LazyVerticalGrid(
            columns = GridCells.Fixed(3)
        ) {
            items(playersList) { player ->
                GameItem(player)
            }
        }*/
    }
}

@Composable
fun PlayerItem(player: Player) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 5.dp, bottom = 5.dp),
        shape = CircleShape
    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .border(2.dp, Color.Black, CircleShape)
            .padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = player.name
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    modifier = Modifier.padding(end = 8.dp),
                    text = player.ratio.toString()
                )
                Icon(
                    imageVector =  Icons.Outlined.Edit,
                    contentDescription = stringResource(id = R.string.ib_edit),
                    modifier = Modifier
                        .clickable { println("edit ${player.uid}") }
                        .padding(end = 8.dp)
                )
                Icon(
                    imageVector =  Icons.Outlined.Delete,
                    contentDescription = stringResource(id = R.string.ib_delete),
                    modifier = Modifier.clickable { println("delete ${player.uid}") }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    TeamScreen()
}