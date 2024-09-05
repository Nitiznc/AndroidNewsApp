package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "News",
        description = "It's About new",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "All latest News",
        description = "It will cover all the news from all over the world",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Let's start!",
        description = "You can see the all the news from all of the world",
        image = R.drawable.onboarding2
    )
)