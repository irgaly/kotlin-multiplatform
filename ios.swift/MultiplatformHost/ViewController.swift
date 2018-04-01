import UIKit
import KMLibrary

class ViewController: UIViewController {
    @IBOutlet weak var label: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        let user = KMLUser(name: "user name")
        label.text = "\(KMLPlatform.init().model) / \(user.name)"
    }
}
