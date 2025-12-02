#!/bin/sh

# Z3 directory for version 4.12.2
Z3_DIR="tools/z3-4.12.2"

# Main function to move Z3 files to system directories
move_file_to_usr(){
  # System installation paths
  if [ ! -d "$HOME/.local/bin" ]; then
      mkdir -p "$HOME/.local/bin"
      echo "Created directory $HOME/.local/bin"
  fi
  INSTALL_PREFIX="/usr"
  BINDIR="${INSTALL_PREFIX}/bin"
  LIBDIR="${INSTALL_PREFIX}/lib"
  
  echo "Installing Z3 ${Z3_DIR} to ${INSTALL_PREFIX}"
  
  # Copy library files to system library directory
  cp "${Z3_DIR}/lib/libz3.so" "${Z3_DIR}/lib/libz3java.so" "${LIBDIR}/"
  chmod +x "${LIBDIR}/libz3.so" "${LIBDIR}/libz3java.so"

  # Copy executable to system binary directory
  cp "${Z3_DIR}/bin/z3" "${BINDIR}/"
  chmod +x "${BINDIR}/z3"
  
  # Copy executable to user's local binary directory
  cp "${Z3_DIR}/bin/z3" "$HOME/.local/bin/"
  chmod +x "$HOME/.local/bin/z3"

  # Strip debugging symbols to reduce file size
#   strip "${LIBDIR}/libz3.so"
#   strip "${LIBDIR}/libz3java.so"
#   strip "${BINDIR}/z3"
  
  echo "Z3 4.12.2 installation completed"
  echo "Installed files:"
  echo "  Library: ${LIBDIR}/libz3.so, ${LIBDIR}/libz3java.so"
  echo "  Executable: ${BINDIR}/z3, $HOME/.local/bin/z3"
}

# Execute the installation
move_file_to_usr
