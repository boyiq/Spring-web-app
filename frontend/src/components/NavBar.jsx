import React from 'react';
import { Navbar, Nav, Container, Form, Button } from 'react-bootstrap';

function MyNavbar() {
  return (
    <div>
        <Navbar bg="light" expand="lg">
            <Container>
            <Navbar.Brand href='/'>My App</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="ml-auto">
                <Nav.Link href='/'>Home</Nav.Link>
                <Nav.Link href='/linkpage'>Link Page</Nav.Link>
            </Nav>
            </Navbar.Collapse>
            </Container>
            <Button href='/login'>Log in</Button>
        </Navbar>
    </div>
  );
}

export default MyNavbar;
