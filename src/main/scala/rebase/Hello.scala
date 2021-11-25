package rebase

object Hello extends App {

  println("Hello, Dan!")

  println("HI, Michal!")

  println("Hello, ZAHIR!")

  println("HELLO, Jack!")

  println("Hello, Darrell!")

  println("How to git rebase...")

  println(
  """
      |First do a git pull on main:
      | git checkout main && git pull && git checkout -
      | (alias 'gpm' for me)
      |
      |Then make sure you have committed your work on this branch
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
      |If all goes well, then rebase is complete.
      |
      |There may be merge conflicts though
      |
      |
      |""".stripMargin
  )

}
