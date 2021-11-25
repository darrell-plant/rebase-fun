package rebase

object Hello extends App {

  println("Hello, Dan!")

  println("Hello, Michal!")

  println("Hello, Zahir!")

  println("Hello, Jack!")

  println("Hello, Darrell!")

  println("How to git rebase...")

  println(
  """
      |First do a git pull on main:
      | git checkout main && git pull && git checkout -
      | (alias 'gpm' for me)
      |
      |Then make sure you have committed your worl on this branch
      |
      |Then rebase interactively:
      | git rebase -i main
      | (alias 'grim' for me)
      |
      |Next, typically you save the rebase commit message as is
      |containing the commits current on your branch (more advanced options available)
      |  "pick <commit_id> <commit_msg"
      |[save]
      |
      |
      |""".stripMargin
  )

}
