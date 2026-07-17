package com.markel.flowstate.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.markel.flowstate.core.designsystem.R

/**
 * Canonical Material 3 typography scale (unmodified).
 *
 * We intentionally do NOT redefine [fontSize], [lineHeight] or [letterSpacing] for the 15 M3
 * styles: those values are already tuned by the Material design team. The "premium" feel comes
 * from swapping [fontFamily] to a custom variable font (Li Ador Noirrit) and activating OpenType
 * features (`ss02`, `dlig`).
 *
 */
private val DefaultTypography = Typography()

/**
 * OpenType features enabled across the whole scale:
 *  - `ss02`: Stylistic Set 02 — alternate glyph variants (e.g. two-storey "a").
 *  - `dlig`: Discretionary Ligatures — refined letter combinations for display contexts.
 */
private const val OPEN_TYPE_FEATURES = "ss02, dlig"

/**
 * Custom static Font family for Li Ador Noirrit.
 */
private val LiAdorNoirritFontFamily = FontFamily(
    Font(resId = R.font.li_ador_noirrit_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(resId = R.font.li_ador_noirrit_light, weight = FontWeight.Light, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(resId = R.font.li_ador_noirrit_extralight, weight = FontWeight.ExtraLight, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_extralight_italic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
    Font(resId = R.font.li_ador_noirrit_semibold, weight = FontWeight.SemiBold, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_semibold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
    Font(resId = R.font.li_ador_noirrit_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),

    // Map other weights to avoid system font fallback
    Font(resId = R.font.li_ador_noirrit_regular, weight = FontWeight.Medium, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(resId = R.font.li_ador_noirrit_bold, weight = FontWeight.Black, style = FontStyle.Normal),
    Font(resId = R.font.li_ador_noirrit_bold_italic, weight = FontWeight.Black, style = FontStyle.Italic),
)

/**
 * The Material 3 typography for FlowState.
 */
@Composable
fun FlowStateTypography(): Typography {
    val family = LiAdorNoirritFontFamily
    return remember(family) {
        Typography(
            // Hero text — display font.
            displayLarge = DefaultTypography.displayLarge.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            displayMedium = DefaultTypography.displayMedium.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            displaySmall = DefaultTypography.displaySmall.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            // Headlines — display personality.
            headlineLarge = DefaultTypography.headlineLarge.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            headlineMedium = DefaultTypography.headlineMedium.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            headlineSmall = DefaultTypography.headlineSmall.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            // Titles — text font.
            titleLarge = DefaultTypography.titleLarge.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            titleMedium = DefaultTypography.titleMedium.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            titleSmall = DefaultTypography.titleSmall.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            // Body — text font.
            bodyLarge = DefaultTypography.bodyLarge.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            bodyMedium = DefaultTypography.bodyMedium.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            bodySmall = DefaultTypography.bodySmall.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            // Labels — text font.
            labelLarge = DefaultTypography.labelLarge.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            labelMedium = DefaultTypography.labelMedium.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
            labelSmall = DefaultTypography.labelSmall.copy(
                fontFamily = family,
                fontFeatureSettings = OPEN_TYPE_FEATURES,
            ),
        )
    }
}
