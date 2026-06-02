 You are editing an existing GitHub Wiki page titled **"Ask a Query & Forum Engine"**.

IMPORTANT: Do NOT rewrite the document from scratch. Preserve the existing structure, headings, feature coverage, and overall content wherever possible. Make only the changes listed below.

## Required Changes

### 1. Update Key Capabilities

Replace the current "Key Capabilities" list with:

- Structured query submission
- Category and tag taxonomy enforcement
- Screenshot attachments
- AI-assisted grammar correction
- Duplicate query detection
- Hybrid search
- Answer management
- Threaded comments
- Voting and bookmarking
- Helpful answer selection
- Automated solution finalization

Remove:
- Gibberish detection
- Spam prevention and penalty escalation

---

### 2. Remove Architecture Overview Completely

Delete the entire section:

# Architecture Overview

Including:
- Architecture description
- Component diagrams
- Flow diagrams
- Service interactions
- Technical architecture explanations

---

### 3. Keep Question Posting Workflow But Simplify It

Keep all existing subheadings:

- Query Submission Interface
- Category Selection
- Tag Selection
- Attachment Support
- Grammar Correction Workflow

Rewrite them as feature descriptions only.

Remove:
- API endpoints
- HTTP examples
- JSON responses
- Dynamic loading details
- Technical implementation details
- Code snippets

Example:

Category Selection

"Users must select a category from the predefined category list to ensure proper organization and classification of queries."

---

### 4. Keep Query Creation Pipeline

Do NOT delete this section.

Replace all technical details with:

"After submission, queries undergo validation, categorization, duplicate checking, and storage to maintain content quality, consistency, and discoverability across the platform."

Remove:
- queryController references
- queryService references
- execution sequence
- numbered backend operations
- implementation details

---

### 5. Keep Taxonomy Management

Keep the section but simplify it.

Suggested content:

"The platform uses a controlled taxonomy system to maintain consistency across categories and tags. This helps organize discussions effectively and ensures users can easily browse and discover relevant content."

Remove:
- validation code
- Taxonomy.findOne examples
- database references
- implementation details

---

### 6. Delete These Three Sections Completely

Delete:

# Gibberish Detection Pipeline

# Spam Prevention & Penalty System

# Duplicate Detection & Vector Search

Including all of their subsections, tables, examples, code snippets, thresholds, workflows, and technical explanations.

---

### 7. Replace Them With One New Section

Add:

# Query Quality & Similarity Management

The platform helps maintain high-quality discussions by reducing duplicate content, encouraging meaningful query submissions, and improving content discoverability. Similar discussions can be identified and surfaced to users, helping reduce redundancy and promote better knowledge sharing within the community.

---

### 8. Simplify Query Discovery & Search

Keep:

- Query Listing
- Search Functionality
- Pagination
- Query Ordering

Convert them into feature descriptions only.

Remove:
- API endpoints
- MongoDB references
- semantic search implementation details
- embeddings
- cosine similarity references
- code examples

---

### 9. Simplify Answers & Threaded Comments

Keep:

- Answer Creation
- Answer Editing
- Answer Deletion
- Threaded Comments
- Comment Creation
- Comment Deletion

Describe only what each feature does.

Remove:
- validation rules
- permissions logic
- API endpoints
- workflow details
- internal processing explanations

---

### 10. Simplify Helpful Answer & Resolution Workflow

Keep:

- Mark Helpful
- Accepted Answer Display
- Unmark Helpful

Describe functionality only.

Remove:
- endpoints
- reputation logic
- backend actions
- workflow implementation details

---

### 11. Simplify Voting & Bookmarking

Keep:

- Query Voting
- Answer Voting
- Bookmarking

Describe feature behavior only.

Remove:
- vote storage details
- signed vote values
- reputation calculations
- API endpoints

---

### 12. Simplify Solution Finalization Engine

Keep:

- Finalization Trigger
- Eligibility Rules
- Manual Resolution Path
- Automatic Resolution Path
- Answer Pruning
- Audit Logging

Convert them into simple feature descriptions.

Remove:
- cron scheduling
- thresholds
- automation logic
- pruning algorithms
- implementation details

---

### 13. Keep Frontend Responsibilities

Keep the table.

Only simplify wording if necessary.

---

### 14. Keep Service Layer Responsibilities

Keep the table.

Only simplify wording if necessary.

Do not add technical implementation details.

---

### 15. Remove Completely

Delete:

- Architecture Overview
- API Summary
- End-to-End Workflow
- All API endpoints
- All HTTP examples
- All JSON examples
- All code blocks
- All service execution flows
- All controller references
- All database query examples
- All technical implementation snippets

---

### Final Output Requirements

- Preserve the original wiki structure.
- Preserve all existing major features.
- Keep existing headings and subheadings wherever possible.
- Focus on "Feature → What it does".
- Do not introduce new features not present in the repository.
- Do not remove important user-facing functionality.
- Make the document cleaner, shorter, and suitable for a GitHub Wiki.
- Ensure the original content remains recognizable while removing excessive technical implementation details.
