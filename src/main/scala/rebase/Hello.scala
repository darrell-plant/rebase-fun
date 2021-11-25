package rebase

object Hello extends App {

  println("Hello, Dan!")

  println("Hello, Michal!")

  println("Hello, Zahir!")

  println("Hello, Jack!")

  println("How to git rebase...")

  println(
  """
      |First do a git pull on main:
      | git checkout main && git pull && git checkout -
      | (alias 'gpm' for me)
      |
      |Then rebase interactively:
      | git rebase -i main
      | (alias 'grim' for me)
      |
      |
      |""".stripMargin
  )

}
