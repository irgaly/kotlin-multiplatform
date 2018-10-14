import UIKit
import KotlinMultiPlatform

class ViewController: UIViewController {
    @IBOutlet weak var label: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        let user = User(name: "user name")
        label.text = "\(Platform.init().model) / \(user.name)"
    }
}
