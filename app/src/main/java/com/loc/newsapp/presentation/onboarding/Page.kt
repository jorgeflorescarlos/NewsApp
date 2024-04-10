package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf<Page>(
    Page(
        title = "Page 1",
        description = "Description 1",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Page 2",
        description = "Description 2",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Page 3",
        description = "Description 3",
        image = R.drawable.onboarding3
    ),
)
