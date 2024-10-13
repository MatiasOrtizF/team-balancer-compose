package com.mfo.teambalancerapp.domain.model

import com.mfo.teambalancerapp.R

sealed class LanguageInfo(val languageOriginal: String, val languageTranslate: Int, val locale: String) {
    object English: LanguageInfo("English", R.string.tv_english, "en")
    object Mandarin: LanguageInfo("中文", R.string.tv_mandarin_chinese, "zh")
    object Hindi: LanguageInfo("हिन्दी", R.string.tv_hindi, "hi")
    object Spanish: LanguageInfo("Español", R.string.tv_spanish, "es")
    object French: LanguageInfo("Français", R.string.tv_french, "fr")
    object Arabic: LanguageInfo("العربي", R.string.tv_arabic, "ar")
    //object Bengali: LanguageInfo("বাংলা", R.string.tv_bengali, "bn")
    object Portuguese: LanguageInfo("Português", R.string.tv_portuguese, "pt")
    object Russian: LanguageInfo("Русский", R.string.tv_russian, "ru")
    object Urdu: LanguageInfo("اردو", R.string.tv_urdu, "ur")
}