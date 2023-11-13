package di

import features.ui.viewmodel.ShoesKMPViewModel
import org.koin.dsl.module


val koinModule = module {
    factory { ShoesKMPViewModel() }
}