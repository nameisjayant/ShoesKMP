package features.domain.model

data class OnboardingModel(
    val id: Int,
    val title: String,
    val description: String,
    val image: String
)

val onboardList = listOf(
    OnboardingModel(
        1,
        "Start Journey With Nike",
        "Smart, Gorgeous & Fashionable Collection",
        "onboard.png"
    ),
    OnboardingModel(
        2,
        "Follow Latest Style Shoes",
        "There Are Many Beautiful And Attractive Plants To Your Room",
        "onboard_2.png"
    ),
    OnboardingModel(
        3,
        "Summer Shoes Nike 2022",
        "Amet Minim Lit Nodeseru Saku Nandu sit Alique Dolor",
        "onboard_3.png"
    )
)