import UIKit
import SwiftUI
import ComposeApp

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        ShoesViewControllerKt.ShoesAppViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        ComposeView()
        .edgesIgnoringSafeArea(.top)
               // .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}



