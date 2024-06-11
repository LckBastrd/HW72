package com.example.hw7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.hw7.ui.theme.HW7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HW7Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PhotoDetailsPage()
                }
            }
        }
    }
}

@Composable
fun PhotoDetailsPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bangkok4top),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize() // Растягиваем изображение на всю ширину
            )
            Row(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Bangkok",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Увеличиваем отступ сверху

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Biel Morro",
                color = Color.White,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.download),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp) // Увеличиваем размер иконок
                        .padding(horizontal = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.favorite),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp) // Увеличиваем размер иконок
                        .padding(horizontal = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp) // Увеличиваем размер иконок
                        .padding(horizontal = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Увеличиваем отступ сверху
        Divider(color = Color.White.copy(alpha = 0.5f)) // Добавляем разделительную линию

        CameraDetails()

        Spacer(modifier = Modifier.height(16.dp)) // Увеличиваем отступ сверху и снизу
        Divider(color = Color.White.copy(alpha = 0.5f)) // Добавляем разделительную линию

        StatsSection()

        Spacer(modifier = Modifier.height(16.dp)) // Увеличиваем отступ сверху и снизу
        Divider(color = Color.White.copy(alpha = 0.5f)) // Добавляем разделительную линию

        Spacer(modifier = Modifier.height(16.dp)) // Увеличиваем дополнительное пространство перед кнопками
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start // Сдвигаем кнопки к левому краю
        ) {
            Chip("Barcelona")
            Spacer(modifier = Modifier.width(8.dp))
            Chip("Spain")
        }
    }
}

@Composable
fun CameraDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp), // Увеличиваем отступы сверху и снизу
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Camera", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp)) // Увеличиваем отступы между строками
                Text(text = "NIKON D3200", color = Color.White, fontSize = 14.sp)
            }
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Aperture", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp)) // Увеличиваем отступы между строками
                Text(text = "f/5.0", color = Color.White, fontSize = 14.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp), // Увеличиваем отступы сверху и снизу
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Focal Length", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp)) // Увеличиваем отступы между строками
                Text(text = "18.0mm", color = Color.White, fontSize = 14.sp)
            }
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Shutter Speed", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp)) // Увеличиваем отступы между строками
                Text(text = "1/125s", color = Color.White, fontSize = 14.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp), // Увеличиваем отступы сверху и снизу
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "ISO", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp)) // Увеличиваем отступы между строками
                Text(text = "100", color = Color.White, fontSize = 14.sp)
            }
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Dimensions", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp)) // Увеличиваем отступы между строками
                Text(text = "3906 × 4882", color = Color.White, fontSize = 14.sp)
            }
        }
    }
}

@Composable
fun StatsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp), // Добавляем отступы слева и справа
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        StatItem(label = "Views", value = "8.8M")
        StatItem(label = "Downloads", value = "99.1K")
        StatItem(label = "Likes", value = "1.8K")
    }
}

@Composable
fun StatItem(label: String, value: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(vertical = 8.dp) // Увеличиваем отступы сверху и снизу
    ) {
        Text(text = value, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = label, color = Color.Gray, fontSize = 14.sp)
    }
}

@Composable
fun Chip(label: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Gray)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(text = label, color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HW7Theme {
        PhotoDetailsPage()
    }
}
