package com.vinay.myapplication.presentation.pull_request_listings

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vinay.myapplication.util.DEFAULT_RECIPE_IMAGE
import com.vinay.myapplication.util.loadPicture
import com.vinay.myapplication.domain.model.PullRequest
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.asImageBitmap

@Composable
fun CompanyItem(
    company: PullRequest,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        company.user.avatar_url?.let { url ->
            val image = loadPicture(url = url, defaultImage = DEFAULT_RECIPE_IMAGE).value
            image?.let { img ->
                Image(
                    bitmap = img.asImageBitmap(),
                    "",
                    modifier = Modifier
                        .weight(1.5f),
                    contentScale = ContentScale.Crop,
                )
            }
        }
        Column(
            modifier =  Modifier.padding(16.dp).weight(2.5f)
        ) {
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Title : ${company.title}",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                color = MaterialTheme.colors.onBackground,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Created Date : ${company.created_at}",
                fontWeight = FontWeight.Light,
                color = MaterialTheme.colors.onBackground
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Closed Data : ${company.closed_at}",
                fontStyle = FontStyle.Italic,
                color = MaterialTheme.colors.onBackground
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Name : ${company.user.login}",
                fontStyle = FontStyle.Italic,
                color = MaterialTheme.colors.onBackground
            )
        }
    }
}