import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel

    var body: some View {
        Text(viewModel.text)
    }
}

extension ContentView {
    // declared as an extension to ContentView as they are closely connected
    class ViewModel: ObservableObject {
        @Published var text = "Loading..."
        init() {
            // suspending functions are available in it as functions with callbacks (completionHandler).
            // any exceptions that are instances of the Exception class or its subclass will be propagated as NSError
            Greeting().greet { greeting, error in
                DispatchQueue.main.async {
                    if let greeting = greeting {
                        self.text = greeting
                    } else {
                        self.text = error?.localizedDescription ?? "error"
                    }
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView(viewModel: ContentView.ViewModel())
	}
}
